package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Fiber_pin: ImageVector
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
                moveTo(200f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 480f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(250f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(110f, 0f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-140f)
                lineToRelative(102f, 140f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(140f)
                lineTo(610f, 360f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(240f)
                close()
                moveTo(260f, 460f)
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
            }
        }.build()
        
        return _Fiber_pin!!
    }

private var _Fiber_pin: ImageVector? = null

