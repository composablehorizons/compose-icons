package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.GlobeAmericas: ImageVector
    get() {
        if (_GlobeAmericas != null) return _GlobeAmericas!!
        
        _GlobeAmericas = ImageVector.Builder(
            name = "globe-americas",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(7f, 7f, 0f, true, false, 0f, 14f)
                arcTo(7f, 7f, 0f, false, false, 8f, 1f)
                close()
                moveTo(4.5f, 3.757f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 6.857f, -0.114f)
                lineToRelative(-0.65f, 0.65f)
                arcToRelative(0.707f, 0.707f, 0f, false, false, -0.207f, 0.5f)
                curveToRelative(0f, 0.39f, -0.317f, 0.707f, -0.707f, 0.707f)
                horizontalLineTo(8.427f)
                arcToRelative(0.496f, 0.496f, 0f, false, false, -0.413f, 0.771f)
                lineToRelative(0.25f, 0.376f)
                arcToRelative(0.481f, 0.481f, 0f, false, false, 0.616f, 0.163f)
                arcToRelative(0.962f, 0.962f, 0f, false, true, 1.11f, 0.18f)
                lineToRelative(0.573f, 0.573f)
                arcToRelative(1f, 1f, 0f, false, true, 0.242f, 1.023f)
                lineToRelative(-1.012f, 3.035f)
                arcToRelative(1f, 1f, 0f, false, true, -1.191f, 0.654f)
                lineToRelative(-0.345f, -0.086f)
                arcToRelative(1f, 1f, 0f, false, true, -0.757f, -0.97f)
                verticalLineToRelative(-0.305f)
                arcToRelative(1f, 1f, 0f, false, false, -0.293f, -0.707f)
                lineTo(6.1f, 9.1f)
                arcToRelative(0.849f, 0.849f, 0f, false, true, 0f, -1.2f)
                curveToRelative(0.22f, -0.22f, 0.22f, -0.58f, 0f, -0.8f)
                lineToRelative(-0.721f, -0.721f)
                arcTo(3f, 3f, 0f, false, true, 4.5f, 4.257f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }.build()
        
        return _GlobeAmericas!!
    }

private var _GlobeAmericas: ImageVector? = null

