package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_android_bolt: ImageVector
    get() {
        if (_Battery_android_bolt != null) return _Battery_android_bolt!!
        
        _Battery_android_bolt = ImageVector.Builder(
            name = "battery_android_bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(390f, 630f)
                horizontalLineToRelative(20f)
                lineToRelative(180f, -180f)
                horizontalLineTo(463f)
                lineToRelative(27f, -120f)
                horizontalLineToRelative(-20f)
                lineTo(290f, 510f)
                horizontalLineToRelative(127f)
                lineToRelative(-27f, 120f)
                close()
                moveToRelative(-230f, 40f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-380f)
                horizontalLineTo(160f)
                verticalLineToRelative(380f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-540f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(170f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(170f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-380f)
                verticalLineToRelative(380f)
                close()
            }
        }.build()
        
        return _Battery_android_bolt!!
    }

private var _Battery_android_bolt: ImageVector? = null

