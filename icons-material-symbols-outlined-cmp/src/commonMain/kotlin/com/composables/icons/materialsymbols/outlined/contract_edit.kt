package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Contract_edit: ImageVector
    get() {
        if (_Contract_edit != null) return _Contract_edit!!
        
        _Contract_edit = ImageVector.Builder(
            name = "contract_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, 320f)
                horizontalLineTo(200f)
                horizontalLineToRelative(280f)
                close()
                moveToRelative(0f, 80f)
                horizontalLineTo(240f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(361f)
                quadToRelative(-20f, -2f, -40.5f, 1.5f)
                reflectiveQuadTo(760f, 455f)
                verticalLineToRelative(-295f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(240f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(200f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-123f)
                lineToRelative(221f, -220f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4f, 22.5f)
                reflectiveQuadTo(903f, 660f)
                lineTo(683f, 880f)
                horizontalLineTo(560f)
                close()
                moveToRelative(300f, -263f)
                lineToRelative(-37f, -37f)
                lineToRelative(37f, 37f)
                close()
                moveTo(620f, 820f)
                horizontalLineToRelative(38f)
                lineToRelative(121f, -122f)
                lineToRelative(-18f, -19f)
                lineToRelative(-19f, -18f)
                lineToRelative(-122f, 121f)
                verticalLineToRelative(38f)
                close()
                moveToRelative(141f, -141f)
                lineToRelative(-19f, -18f)
                lineToRelative(37f, 37f)
                lineToRelative(-18f, -19f)
                close()
            }
        }.build()
        
        return _Contract_edit!!
    }

private var _Contract_edit: ImageVector? = null

