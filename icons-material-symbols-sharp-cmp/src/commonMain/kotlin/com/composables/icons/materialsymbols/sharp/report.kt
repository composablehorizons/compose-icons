package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Report: ImageVector
    get() {
        if (_Report != null) return _Report!!
        
        _Report = ImageVector.Builder(
            name = "report",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-40f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
                moveTo(330f, 840f)
                lineTo(120f, 630f)
                verticalLineToRelative(-300f)
                lineToRelative(210f, -210f)
                horizontalLineToRelative(300f)
                lineToRelative(210f, 210f)
                verticalLineToRelative(300f)
                lineTo(630f, 840f)
                horizontalLineTo(330f)
                close()
                moveToRelative(34f, -80f)
                horizontalLineToRelative(232f)
                lineToRelative(164f, -164f)
                verticalLineToRelative(-232f)
                lineTo(596f, 200f)
                horizontalLineTo(364f)
                lineTo(200f, 364f)
                verticalLineToRelative(232f)
                lineToRelative(164f, 164f)
                close()
                moveToRelative(116f, -280f)
                close()
            }
        }.build()
        
        return _Report!!
    }

private var _Report: ImageVector? = null

