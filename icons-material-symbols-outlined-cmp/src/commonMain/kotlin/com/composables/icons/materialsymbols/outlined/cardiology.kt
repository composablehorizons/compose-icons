package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cardiology: ImageVector
    get() {
        if (_Cardiology != null) return _Cardiology!!
        
        _Cardiology = ImageVector.Builder(
            name = "cardiology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 120f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(81f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 63f)
                reflectiveQuadToRelative(63f, 157f)
                quadToRelative(0f, 5f, -0.5f, 10f)
                reflectiveQuadToRelative(-0.5f, 10f)
                horizontalLineToRelative(-80f)
                quadToRelative(1f, -5f, 1f, -10f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -60f, -40f, -100f)
                reflectiveQuadToRelative(-100f, -40f)
                quadToRelative(-47f, 0f, -87f, 26.5f)
                reflectiveQuadTo(518f, 294f)
                horizontalLineToRelative(-76f)
                quadToRelative(-15f, -41f, -55f, -67.5f)
                reflectiveQuadTo(300f, 200f)
                quadToRelative(-60f, 0f, -100f, 40f)
                reflectiveQuadToRelative(-40f, 100f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 5f, 1f, 10f)
                horizontalLineTo(81f)
                quadToRelative(0f, -5f, -0.5f, -10f)
                reflectiveQuadToRelative(-0.5f, -10f)
                quadToRelative(0f, -94f, 63f, -157f)
                reflectiveQuadToRelative(157f, -63f)
                close()
                moveToRelative(-88f, 480f)
                horizontalLineToRelative(112f)
                quadToRelative(32f, 31f, 70f, 67f)
                reflectiveQuadToRelative(86f, 79f)
                quadToRelative(48f, -43f, 86f, -79f)
                reflectiveQuadToRelative(70f, -67f)
                horizontalLineToRelative(113f)
                quadToRelative(-38f, 42f, -90f, 91f)
                reflectiveQuadTo(538f, 802f)
                lineToRelative(-58f, 52f)
                lineToRelative(-58f, -52f)
                quadToRelative(-69f, -62f, -120.5f, -111f)
                reflectiveQuadTo(212f, 600f)
                close()
                moveToRelative(230f, 40f)
                quadToRelative(13f, 0f, 22.5f, -7.5f)
                reflectiveQuadTo(478f, 613f)
                lineToRelative(54f, -163f)
                lineToRelative(35f, 52f)
                quadToRelative(5f, 8f, 14f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(623f)
                lineToRelative(-69f, -102f)
                quadToRelative(-6f, -9f, -15.5f, -13.5f)
                reflectiveQuadTo(518f, 320f)
                quadToRelative(-13f, 0f, -22.5f, 7.5f)
                reflectiveQuadTo(482f, 347f)
                lineToRelative(-54f, 162f)
                lineToRelative(-34f, -51f)
                quadToRelative(-5f, -8f, -14f, -13f)
                reflectiveQuadToRelative(-19f, -5f)
                horizontalLineTo(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(297f)
                lineToRelative(69f, 102f)
                quadToRelative(6f, 9f, 15.5f, 13.5f)
                reflectiveQuadTo(442f, 640f)
                close()
                moveToRelative(38f, -167f)
                close()
            }
        }.build()
        
        return _Cardiology!!
    }

private var _Cardiology: ImageVector? = null

