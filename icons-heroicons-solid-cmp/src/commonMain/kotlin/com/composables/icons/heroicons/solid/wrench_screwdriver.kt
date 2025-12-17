package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.WrenchScrewdriver: ImageVector
    get() {
        if (_WrenchScrewdriver != null) return _WrenchScrewdriver!!
        
        _WrenchScrewdriver = ImageVector.Builder(
            name = "wrench-screwdriver",
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.076f, 8.64f)
                lineToRelative(-2.201f, -2.2f)
                verticalLineTo(4.874f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.364f, -0.643f)
                lineToRelative(-3.75f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.916f, 0.113f)
                lineToRelative(-0.75f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.113f, 0.916f)
                lineToRelative(2.25f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.643f, 0.364f)
                horizontalLineToRelative(1.564f)
                lineToRelative(2.062f, 2.062f)
                lineToRelative(1.575f, -1.297f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.556f, 17.329f)
                lineToRelative(4.183f, 4.182f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, 4.773f, -4.773f)
                lineToRelative(-3.306f, -3.305f)
                arcToRelative(6.803f, 6.803f, 0f, false, true, -1.53f, 0.043f)
                curveToRelative(-0.394f, -0.034f, -0.682f, -0.006f, -0.867f, 0.042f)
                arcToRelative(0.589f, 0.589f, 0f, false, false, -0.167f, 0.063f)
                lineToRelative(-3.086f, 3.748f)
                close()
                moveToRelative(3.414f, -1.36f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(1.875f, 1.876f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(15.97f, 17.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _WrenchScrewdriver!!
    }

private var _WrenchScrewdriver: ImageVector? = null

