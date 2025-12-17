package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_camera_rear: ImageVector
    get() {
        if (_Mobile_camera_rear != null) return _Mobile_camera_rear!!
        
        _Mobile_camera_rear = ImageVector.Builder(
            name = "mobile_camera_rear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(394f, 900f)
                lineToRelative(-56f, -56f)
                lineToRelative(44f, -44f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(182f)
                lineToRelative(-44f, -44f)
                lineToRelative(56f, -56f)
                lineToRelative(140f, 140f)
                lineTo(394f, 900f)
                close()
                moveToRelative(166f, -100f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-80f, -600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 200f)
                close()
                moveTo(200f, 680f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(204f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(204f)
                horizontalLineTo(511f)
                lineTo(394f, 563f)
                lineTo(277f, 680f)
                horizontalLineToRelative(-77f)
                close()
            }
        }.build()
        
        return _Mobile_camera_rear!!
    }

private var _Mobile_camera_rear: ImageVector? = null

