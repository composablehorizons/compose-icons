package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Devices_fold_2: ImageVector
    get() {
        if (_Devices_fold_2 != null) return _Devices_fold_2!!
        
        _Devices_fold_2 = ImageVector.Builder(
            name = "devices_fold_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 840f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(424f)
                quadToRelative(25f, 0f, 45f, 13.5f)
                reflectiveQuadToRelative(29f, 36.5f)
                lineToRelative(96f, 240f)
                quadToRelative(16f, 40f, -7.5f, 75f)
                reflectiveQuadTo(800f, 520f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 840f)
                close()
                moveToRelative(120f, -400f)
                lineToRelative(-96f, -240f)
                horizontalLineTo(280f)
                lineToRelative(96f, 240f)
                horizontalLineToRelative(424f)
                close()
                moveTo(680f, 760f)
                verticalLineToRelative(-240f)
                horizontalLineTo(376f)
                quadToRelative(-25f, 0f, -45f, -13.5f)
                reflectiveQuadTo(302f, 470f)
                lineToRelative(-22f, -55f)
                verticalLineToRelative(345f)
                horizontalLineToRelative(400f)
                close()
                moveTo(540f, 320f)
                close()
            }
        }.build()
        
        return _Devices_fold_2!!
    }

private var _Devices_fold_2: ImageVector? = null

