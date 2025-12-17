package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bullseye: ImageVector
    get() {
        if (_Bullseye != null) return _Bullseye!!
        
        _Bullseye = ImageVector.Builder(
            name = "bullseye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111.03f, 8f, 0f, 119.03f, 0f, 256f)
                reflectiveCurveToRelative(111.03f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.03f, 248f, -248f)
                reflectiveCurveTo(384.97f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 432f)
                curveToRelative(-101.69f, 0f, -184f, -82.29f, -184f, -184f)
                curveToRelative(0f, -101.69f, 82.29f, -184f, 184f, -184f)
                curveToRelative(101.69f, 0f, 184f, 82.29f, 184f, 184f)
                curveToRelative(0f, 101.69f, -82.29f, 184f, -184f, 184f)
                close()
                moveToRelative(0f, -312f)
                curveToRelative(-70.69f, 0f, -128f, 57.31f, -128f, 128f)
                reflectiveCurveToRelative(57.31f, 128f, 128f, 128f)
                reflectiveCurveToRelative(128f, -57.31f, 128f, -128f)
                reflectiveCurveToRelative(-57.31f, -128f, -128f, -128f)
                close()
                moveToRelative(0f, 192f)
                curveToRelative(-35.29f, 0f, -64f, -28.71f, -64f, -64f)
                reflectiveCurveToRelative(28.71f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.71f, 64f, 64f)
                reflectiveCurveToRelative(-28.71f, 64f, -64f, 64f)
                close()
            }
        }.build()
        
        return _Bullseye!!
    }

private var _Bullseye: ImageVector? = null

