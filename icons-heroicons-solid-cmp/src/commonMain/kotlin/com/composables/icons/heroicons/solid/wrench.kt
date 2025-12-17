package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Wrench: ImageVector
    get() {
        if (_Wrench != null) return _Wrench!!
        
        _Wrench = ImageVector.Builder(
            name = "wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6.75f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, 6.775f, -5.025f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.313f, 1.248f)
                lineToRelative(-3.32f, 3.319f)
                curveToRelative(0.063f, 0.475f, 0.276f, 0.934f, 0.641f, 1.299f)
                curveToRelative(0.365f, 0.365f, 0.824f, 0.578f, 1.3f, 0.64f)
                lineToRelative(3.318f, -3.319f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.248f, 0.313f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, -5.472f, 6.756f)
                curveToRelative(-1.018f, -0.086f, -1.87f, 0.1f, -2.309f, 0.634f)
                lineTo(7.344f, 21.3f)
                arcTo(3.298f, 3.298f, 0f, true, true, 2.7f, 16.657f)
                lineToRelative(8.684f, -7.151f)
                curveToRelative(0.533f, -0.44f, 0.72f, -1.291f, 0.634f, -2.309f)
                arcTo(5.342f, 5.342f, 0f, false, true, 12f, 6.75f)
                close()
                moveTo(4.117f, 19.125f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _Wrench!!
    }

private var _Wrench: ImageVector? = null

