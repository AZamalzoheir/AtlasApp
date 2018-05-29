package com.example.amalzoheir.atlasapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class fourthFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fifth_section_fragment_layout,container,false);
        ArrayList<TextAtlasInSections> textAtlasInSectionsArrayList=new ArrayList<TextAtlasInSections>();
        textAtlasInSectionsArrayList.add(new TextAtlasInSections("first"));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections("second"));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections("third"));
        TextInSectionAdapter itemAdapter=new TextInSectionAdapter(this.getActivity(),textAtlasInSectionsArrayList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
        return rootView;
    }
}
