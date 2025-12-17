package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Adjust: ImageVector
    get() {
        if (_Adjust != null) return _Adjust!!
        
        _Adjust = ImageVector.Builder(
            name = "adjust",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 256f)
                curveToRelative(0f, 136.966f, 111.033f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.034f, 248f, -248f)
                reflectiveCurveTo(392.966f, 8f, 256f, 8f)
                reflectiveCurveTo(8f, 119.033f, 8f, 256f)
                close()
                moveToRelative(248f, 184f)
                verticalLineTo(72f)
                curveToRelative(101.705f, 0f, 184f, 82.311f, 184f, 184f)
                curveToRelative(0f, 101.705f, -82.311f, 184f, -184f, 184f)
                close()
            }
        }.build()
        
        return _Adjust!!
    }

private var _Adjust: ImageVector? = null

