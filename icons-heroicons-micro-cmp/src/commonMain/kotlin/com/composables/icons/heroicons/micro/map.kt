package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.37f, 2.257f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, 1.214f, -0.054f)
                lineToRelative(3.378f, 1.69f)
                lineToRelative(2.133f, -1.313f)
                arcTo(1.25f, 1.25f, 0f, false, true, 14f, 3.644f)
                verticalLineToRelative(7.326f)
                curveToRelative(0f, 0.434f, -0.225f, 0.837f, -0.595f, 1.065f)
                lineToRelative(-2.775f, 1.708f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, -1.214f, 0.053f)
                lineToRelative(-3.378f, -1.689f)
                lineToRelative(-2.133f, 1.313f)
                arcTo(1.25f, 1.25f, 0f, false, true, 2f, 12.354f)
                verticalLineTo(5.029f)
                curveToRelative(0f, -0.434f, 0.225f, -0.837f, 0.595f, -1.064f)
                lineTo(5.37f, 2.257f)
                close()
                moveTo(6f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 4f)
                close()
                moveToRelative(4.75f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

