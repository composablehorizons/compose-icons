package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fiber_pin: ImageVector
    get() {
        if (_Fiber_pin != null) return _Fiber_pin!!
        
        _Fiber_pin = ImageVector.Builder(
            name = "fiber_pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 520f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 480f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineTo(220f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(190f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(230f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(260f, 570f)
                verticalLineToRelative(-50f)
                close()
                moveToRelative(220f, -160f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(510f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 360f)
                close()
                moveToRelative(130f, 100f)
                lineToRelative(95f, 130f)
                quadToRelative(3f, 5f, 8f, 7.5f)
                reflectiveQuadToRelative(11f, 2.5f)
                horizontalLineToRelative(12f)
                quadToRelative(10f, 0f, 17f, -7f)
                reflectiveQuadToRelative(7f, -17f)
                verticalLineToRelative(-191f)
                quadToRelative(0f, -11f, -7f, -18f)
                reflectiveQuadToRelative(-18f, -7f)
                quadToRelative(-11f, 0f, -18f, 7f)
                reflectiveQuadToRelative(-7f, 18f)
                verticalLineToRelative(115f)
                lineToRelative(-93f, -130f)
                quadToRelative(-4f, -5f, -9f, -7.5f)
                reflectiveQuadToRelative(-11f, -2.5f)
                horizontalLineToRelative(-12f)
                quadToRelative(-11f, 0f, -18f, 7f)
                reflectiveQuadToRelative(-7f, 18f)
                verticalLineToRelative(190f)
                quadToRelative(0f, 11f, 7f, 18f)
                reflectiveQuadToRelative(18f, 7f)
                quadToRelative(11f, 0f, 18f, -7f)
                reflectiveQuadToRelative(7f, -18f)
                verticalLineToRelative(-115f)
                close()
                moveToRelative(-350f, 0f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Fiber_pin!!
    }

private var _Fiber_pin: ImageVector? = null

