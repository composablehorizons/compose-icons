package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Mic_double: ImageVector
    get() {
        if (_Mic_double != null) return _Mic_double!!
        
        _Mic_double = ImageVector.Builder(
            name = "mic_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-123f)
                quadToRelative(-104f, -14f, -172f, -93f)
                reflectiveQuadTo(40f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(320f, 640f)
                horizontalLineToRelative(10f)
                quadToRelative(5f, 0f, 10f, -1f)
                quadToRelative(13f, 20f, 28f, 37.5f)
                reflectiveQuadToRelative(32f, 32.5f)
                quadToRelative(-10f, 3f, -19.5f, 4.5f)
                reflectiveQuadTo(360f, 717f)
                verticalLineToRelative(123f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(20f, -282f)
                quadToRelative(-43f, -8f, -71.5f, -40.5f)
                reflectiveQuadTo(200f, 440f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(160f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 31f, 5f, 60.5f)
                reflectiveQuadToRelative(15f, 57.5f)
                close()
                moveToRelative(340f, 2f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-40f, 280f)
                verticalLineToRelative(-123f)
                quadToRelative(-104f, -14f, -172f, -93f)
                reflectiveQuadToRelative(-68f, -184f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(840f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 105f, -68f, 184f)
                reflectiveQuadToRelative(-172f, 93f)
                verticalLineToRelative(123f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -360f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 440f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 200f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 480f)
                close()
                moveToRelative(0f, -160f)
                close()
            }
        }.build()
        
        return _Mic_double!!
    }

private var _Mic_double: ImageVector? = null

