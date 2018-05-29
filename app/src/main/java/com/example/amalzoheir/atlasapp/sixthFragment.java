package com.example.amalzoheir.atlasapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class sixthFragment extends Fragment {
    private  ArrayList<TextAtlasInSections> textAtlasInSectionsArrayList=new ArrayList<>();
    private RecyclerView recyclerView;
    private TextInSectionAdapter textInSectionAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fifth_section_fragment_layout,container,false);


        recyclerView=(RecyclerView)rootView.findViewById(R.id.recycler_view);
        textInSectionAdapter=new TextInSectionAdapter(textAtlasInSectionsArrayList);
        RecyclerView.LayoutManager textLayoutManager=new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(textLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(textInSectionAdapter);
        prepareDataInTextInSections();
        return rootView;
    }
    private void prepareDataInTextInSections(){
        textAtlasInSectionsArrayList.add(new TextAtlasInSections("first"));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections("second"));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections("third"));
        textInSectionAdapter.notifyDataSetChanged();
    }
}

