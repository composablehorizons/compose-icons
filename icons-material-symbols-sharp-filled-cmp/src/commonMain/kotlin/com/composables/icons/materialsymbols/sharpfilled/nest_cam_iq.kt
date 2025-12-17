package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nest_cam_iq: ImageVector
    get() {
        if (_Nest_cam_iq != null) return _Nest_cam_iq!!
        
        _Nest_cam_iq = ImageVector.Builder(
            name = "nest_cam_iq",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 800f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-163f)
                quadToRelative(-104f, -15f, -172f, -93.5f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(0f, 105f, -68f, 183.5f)
                reflectiveQuadTo(520f, 637f)
                verticalLineToRelative(163f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, -320f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 440f)
                close()
            }
        }.build()
        
        return _Nest_cam_iq!!
    }

private var _Nest_cam_iq: ImageVector? = null

