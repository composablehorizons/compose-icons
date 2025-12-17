package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.AtSymbol: ImageVector
    get() {
        if (_AtSymbol != null) return _AtSymbol!!
        
        _AtSymbol = ImageVector.Builder(
            name = "at-symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.834f, 6.166f)
                arcToRelative(8.25f, 8.25f, 0f, true, false, 0f, 11.668f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 1.06f)
                curveToRelative(-3.807f, 3.808f, -9.98f, 3.808f, -13.788f, 0f)
                curveToRelative(-3.808f, -3.807f, -3.808f, -9.98f, 0f, -13.788f)
                curveToRelative(3.807f, -3.808f, 9.98f, -3.808f, 13.788f, 0f)
                arcTo(9.722f, 9.722f, 0f, false, true, 21.75f, 12f)
                curveToRelative(0f, 0.975f, -0.296f, 1.887f, -0.809f, 2.571f)
                curveToRelative(-0.514f, 0.685f, -1.28f, 1.179f, -2.191f, 1.179f)
                curveToRelative(-0.904f, 0f, -1.666f, -0.487f, -2.18f, -1.164f)
                arcToRelative(5.25f, 5.25f, 0f, true, true, -0.82f, -6.26f)
                verticalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(12f)
                curveToRelative(0f, 0.682f, 0.208f, 1.27f, 0.509f, 1.671f)
                curveToRelative(0.3f, 0.401f, 0.659f, 0.579f, 0.991f, 0.579f)
                curveToRelative(0.332f, 0f, 0.69f, -0.178f, 0.991f, -0.579f)
                curveToRelative(0.3f, -0.4f, 0.509f, -0.99f, 0.509f, -1.671f)
                arcToRelative(8.222f, 8.222f, 0f, false, false, -2.416f, -5.834f)
                close()
                moveTo(15.75f, 12f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, -7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 7.5f, 0f)
                close()
            }
        }.build()
        
        return _AtSymbol!!
    }

private var _AtSymbol: ImageVector? = null

