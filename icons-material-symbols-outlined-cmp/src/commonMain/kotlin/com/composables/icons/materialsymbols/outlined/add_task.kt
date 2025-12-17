package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Add_task: ImageVector
    get() {
        if (_Add_task != null) return _Add_task!!
        
        _Add_task = ImageVector.Builder(
            name = "add_task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(65f, 0f, 123f, 19f)
                reflectiveQuadToRelative(107f, 53f)
                lineToRelative(-58f, 59f)
                quadToRelative(-38f, -24f, -81f, -37.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(32f, 0f, 62f, -6f)
                reflectiveQuadToRelative(58f, -17f)
                lineToRelative(60f, 61f)
                quadToRelative(-41f, 20f, -86f, 31f)
                reflectiveQuadToRelative(-94f, 11f)
                close()
                moveToRelative(280f, -80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(840f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(424f, 664f)
                lineTo(254f, 494f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 114f)
                lineToRelative(400f, -401f)
                lineToRelative(56f, 56f)
                lineToRelative(-456f, 457f)
                close()
            }
        }.build()
        
        return _Add_task!!
    }

private var _Add_task: ImageVector? = null

