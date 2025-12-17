package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PiggyBank: ImageVector
    get() {
        if (_PiggyBank != null) return _PiggyBank!!
        
        _PiggyBank = ImageVector.Builder(
            name = "piggy-bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.964f, 1.527f)
                curveToRelative(-2.977f, 0f, -5.571f, 1.704f, -6.32f, 4.125f)
                horizontalLineToRelative(-0.55f)
                arcTo(1f, 1f, 0f, false, false, 0.11f, 6.824f)
                lineToRelative(0.254f, 1.46f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.478f, 1.243f)
                horizontalLineToRelative(0.263f)
                curveToRelative(0.3f, 0.513f, 0.688f, 0.978f, 1.145f, 1.382f)
                lineToRelative(-0.729f, 2.477f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.48f, 0.641f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.471f, -0.332f)
                lineToRelative(0.482f, -1.351f)
                curveToRelative(0.635f, 0.173f, 1.31f, 0.267f, 2.011f, 0.267f)
                curveToRelative(0.707f, 0f, 1.388f, -0.095f, 2.028f, -0.272f)
                lineToRelative(0.543f, 1.372f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.465f, 0.316f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.478f, -0.645f)
                lineToRelative(-0.761f, -2.506f)
                curveTo(13.81f, 9.895f, 14.5f, 8.559f, 14.5f, 7.069f)
                quadToRelative(0f, -0.218f, -0.02f, -0.431f)
                curveToRelative(0.261f, -0.11f, 0.508f, -0.266f, 0.705f, -0.444f)
                curveToRelative(0.315f, 0.306f, 0.815f, 0.306f, 0.815f, -0.417f)
                curveToRelative(0f, 0.223f, -0.5f, 0.223f, -0.461f, -0.026f)
                arcToRelative(1f, 1f, 0f, false, false, 0.09f, -0.255f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.202f, -0.645f)
                arcToRelative(0.58f, 0.58f, 0f, false, false, -0.707f, -0.098f)
                arcToRelative(0.74f, 0.74f, 0f, false, false, -0.375f, 0.562f)
                curveToRelative(-0.024f, 0.243f, 0.082f, 0.48f, 0.32f, 0.654f)
                arcToRelative(2f, 2f, 0f, false, true, -0.259f, 0.153f)
                curveToRelative(-0.534f, -2.664f, -3.284f, -4.595f, -6.442f, -4.595f)
                moveToRelative(7.173f, 3.876f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, -0.098f, 0.21f)
                lineToRelative(-0.044f, -0.025f)
                curveToRelative(-0.146f, -0.09f, -0.157f, -0.175f, -0.152f, -0.223f)
                arcToRelative(0.24f, 0.24f, 0f, false, true, 0.117f, -0.173f)
                curveToRelative(0.049f, -0.027f, 0.08f, -0.021f, 0.113f, 0.012f)
                arcToRelative(0.2f, 0.2f, 0f, false, true, 0.064f, 0.199f)
                moveToRelative(-8.999f, -0.65f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.276f, -0.96f)
                arcTo(7.6f, 7.6f, 0f, false, true, 7.964f, 3.5f)
                curveToRelative(0.763f, 0f, 1.497f, 0.11f, 2.18f, 0.315f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.287f, 0.958f)
                arcTo(6.6f, 6.6f, 0f, false, false, 7.964f, 4.5f)
                curveToRelative(-0.64f, 0f, -1.255f, 0.09f, -1.826f, 0.254f)
                close()
                moveTo(5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
            }
        }.build()
        
        return _PiggyBank!!
    }

private var _PiggyBank: ImageVector? = null

