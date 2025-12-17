package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Cube: ImageVector
    get() {
        if (_Cube != null) return _Cube!!
        
        _Cube = ImageVector.Builder(
            name = "cube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.372f, 1.349f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.744f, 0f)
                lineToRelative(-4.81f, 2.748f)
                lineTo(8f, 7.131f)
                lineToRelative(5.182f, -3.034f)
                lineToRelative(-4.81f, -2.748f)
                close()
                moveTo(14f, 5.357f)
                lineTo(8.75f, 8.43f)
                verticalLineToRelative(6.005f)
                lineToRelative(4.872f, -2.784f)
                arcTo(0.75f, 0.75f, 0f, false, false, 14f, 11f)
                verticalLineTo(5.357f)
                close()
                moveTo(7.25f, 14.435f)
                verticalLineTo(8.43f)
                lineTo(2f, 5.357f)
                verticalLineTo(11f)
                curveToRelative(0f, 0.27f, 0.144f, 0.518f, 0.378f, 0.651f)
                lineToRelative(4.872f, 2.784f)
                close()
            }
        }.build()
        
        return _Cube!!
    }

private var _Cube: ImageVector? = null

