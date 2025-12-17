package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.View_apps: ImageVector
    get() {
        if (_View_apps != null) return _View_apps!!
        
        _View_apps = ImageVector.Builder(
            name = "view_apps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(87f, 792f)
                quadToRelative(-18f, 3f, -32.5f, -8.5f)
                reflectiveQuadTo(40f, 753f)
                verticalLineToRelative(-546f)
                quadToRelative(0f, -19f, 14.5f, -30.5f)
                reflectiveQuadTo(87f, 168f)
                lineToRelative(160f, 26f)
                quadToRelative(14f, 2f, 23.5f, 13.5f)
                reflectiveQuadTo(280f, 234f)
                verticalLineToRelative(492f)
                quadToRelative(0f, 15f, -9.5f, 26.5f)
                reflectiveQuadTo(247f, 766f)
                lineTo(87f, 792f)
                close()
                moveToRelative(313f, -32f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 200f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 760f)
                horizontalLineTo(400f)
                close()
                moveToRelative(313f, 6f)
                quadToRelative(-14f, -2f, -23.5f, -13.5f)
                reflectiveQuadTo(680f, 726f)
                verticalLineToRelative(-492f)
                quadToRelative(0f, -15f, 9.5f, -26.5f)
                reflectiveQuadTo(713f, 194f)
                lineToRelative(160f, -26f)
                quadToRelative(18f, -3f, 32.5f, 8.5f)
                reflectiveQuadTo(920f, 207f)
                verticalLineToRelative(546f)
                quadToRelative(0f, 19f, -14.5f, 30.5f)
                reflectiveQuadTo(873f, 792f)
                lineToRelative(-160f, -26f)
                close()
            }
        }.build()
        
        return _View_apps!!
    }

private var _View_apps: ImageVector? = null

