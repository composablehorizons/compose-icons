package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.75f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2.624f)
                lineToRelative(0.33f, -0.083f)
                arcTo(6.044f, 6.044f, 0f, false, true, 8f, 11f)
                curveToRelative(1.29f, 0.645f, 2.77f, 0.807f, 4.17f, 0.457f)
                lineToRelative(1.48f, -0.37f)
                arcToRelative(0.462f, 0.462f, 0f, false, false, 0.35f, -0.448f)
                verticalLineTo(3.56f)
                arcToRelative(0.438f, 0.438f, 0f, false, false, -0.544f, -0.425f)
                lineToRelative(-1.287f, 0.322f)
                curveTo(10.77f, 3.808f, 9.291f, 3.646f, 8f, 3f)
                arcToRelative(6.045f, 6.045f, 0f, false, false, -4.17f, -0.457f)
                lineToRelative(-0.34f, 0.085f)
                arcTo(0.75f, 0.75f, 0f, false, false, 2.75f, 2f)
                close()
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

