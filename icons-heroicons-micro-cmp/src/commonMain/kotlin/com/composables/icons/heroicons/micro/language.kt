package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Language: ImageVector
    get() {
        if (_Language != null) return _Language!!
        
        _Language = ImageVector.Builder(
            name = "language",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.688f, 0.452f)
                lineToRelative(3.25f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.376f, 0.596f)
                lineTo(12.89f, 12f)
                horizontalLineTo(9.109f)
                lineToRelative(-0.67f, 1.548f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.377f, -0.596f)
                lineToRelative(3.25f, -7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 11f, 5f)
                close()
                moveToRelative(-1.24f, 5.5f)
                horizontalLineToRelative(2.48f)
                lineTo(11f, 7.636f)
                lineTo(9.76f, 10.5f)
                close()
                moveTo(5f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.261f)
                arcToRelative(25.27f, 25.27f, 0f, false, true, 2.598f, 0.211f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.2f, 1.487f)
                curveToRelative(-0.22f, -0.03f, -0.44f, -0.056f, -0.662f, -0.08f)
                arcTo(12.939f, 12.939f, 0f, false, true, 5.92f, 8.058f)
                curveToRelative(0.237f, 0.304f, 0.488f, 0.595f, 0.752f, 0.873f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.086f, 1.035f)
                arcTo(13.075f, 13.075f, 0f, false, true, 5f, 9.307f)
                arcToRelative(13.068f, 13.068f, 0f, false, true, -2.841f, 2.546f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.827f, -1.252f)
                arcTo(11.566f, 11.566f, 0f, false, false, 4.08f, 8.057f)
                arcToRelative(12.991f, 12.991f, 0f, false, true, -0.554f, -0.938f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.323f, -0.707f)
                curveToRelative(0.049f, 0.09f, 0.099f, 0.181f, 0.15f, 0.271f)
                curveToRelative(0.388f, -0.68f, 0.708f, -1.405f, 0.952f, -2.164f)
                arcToRelative(23.941f, 23.941f, 0f, false, false, -4.1f, 0.19f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.2f, -1.487f)
                curveToRelative(0.853f, -0.114f, 1.72f, -0.185f, 2.598f, -0.211f)
                verticalLineTo(1.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5f, 1f)
                close()
            }
        }.build()
        
        return _Language!!
    }

private var _Language: ImageVector? = null

