package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bug_report: ImageVector
    get() {
        if (_Bug_report != null) return _Bug_report!!
        
        _Bug_report = ImageVector.Builder(
            name = "bug_report",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(-80f, -120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(80f, 40f)
                close()
                moveToRelative(0f, 320f)
                quadToRelative(-65f, 0f, -120.5f, -32f)
                reflectiveQuadTo(272f, 720f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(84f)
                quadToRelative(-3f, -20f, -3.5f, -40f)
                reflectiveQuadToRelative(-0.5f, -40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -20f, 0.5f, -40f)
                reflectiveQuadToRelative(3.5f, -40f)
                horizontalLineToRelative(-84f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(112f)
                quadToRelative(14f, -23f, 31.5f, -43f)
                reflectiveQuadToRelative(40.5f, -35f)
                lineToRelative(-64f, -66f)
                lineToRelative(56f, -56f)
                lineToRelative(86f, 86f)
                quadToRelative(28f, -9f, 57f, -9f)
                reflectiveQuadToRelative(57f, 9f)
                lineToRelative(88f, -86f)
                lineToRelative(56f, 56f)
                lineToRelative(-66f, 66f)
                quadToRelative(23f, 15f, 41.5f, 34.5f)
                reflectiveQuadTo(688f, 320f)
                horizontalLineToRelative(112f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-84f)
                quadToRelative(3f, 20f, 3.5f, 40f)
                reflectiveQuadToRelative(0.5f, 40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 20f, -0.5f, 40f)
                reflectiveQuadToRelative(-3.5f, 40f)
                horizontalLineToRelative(84f)
                verticalLineToRelative(80f)
                horizontalLineTo(688f)
                quadToRelative(-32f, 56f, -87.5f, 88f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Bug_report!!
    }

private var _Bug_report: ImageVector? = null

