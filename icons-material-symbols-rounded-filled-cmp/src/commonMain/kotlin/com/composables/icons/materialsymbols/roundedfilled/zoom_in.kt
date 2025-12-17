package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Zoom_in: ImageVector
    get() {
        if (_Zoom_in != null) return _Zoom_in!!
        
        _Zoom_in = ImageVector.Builder(
            name = "zoom_in",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 420f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(260f, 380f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(300f, 340f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(380f, 260f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(420f, 300f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(500f, 380f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(460f, 420f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(380f, 500f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(340f, 460f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(40f, 220f)
                quadToRelative(-109f, 0f, -184.5f, -75.5f)
                reflectiveQuadTo(120f, 380f)
                quadToRelative(0f, -109f, 75.5f, -184.5f)
                reflectiveQuadTo(380f, 120f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(640f, 380f)
                quadToRelative(0f, 44f, -14f, 83f)
                reflectiveQuadToRelative(-38f, 69f)
                lineToRelative(224f, 224f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(532f, 588f)
                quadToRelative(-30f, 24f, -69f, 38f)
                reflectiveQuadToRelative(-83f, 14f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(560f, 380f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(380f, 200f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(200f, 380f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(380f, 560f)
                close()
            }
        }.build()
        
        return _Zoom_in!!
    }

private var _Zoom_in: ImageVector? = null

