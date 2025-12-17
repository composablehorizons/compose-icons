package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Pinterest: ImageVector
    get() {
        if (_Pinterest != null) return _Pinterest!!
        
        _Pinterest = ImageVector.Builder(
            name = "pinterest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, -2.915f, 15.452f)
                curveToRelative(-0.07f, -0.633f, -0.134f, -1.606f, 0.027f, -2.297f)
                curveToRelative(0.146f, -0.625f, 0.938f, -3.977f, 0.938f, -3.977f)
                reflectiveCurveToRelative(-0.239f, -0.479f, -0.239f, -1.187f)
                curveToRelative(0f, -1.113f, 0.645f, -1.943f, 1.448f, -1.943f)
                curveToRelative(0.682f, 0f, 1.012f, 0.512f, 1.012f, 1.127f)
                curveToRelative(0f, 0.686f, -0.437f, 1.712f, -0.663f, 2.663f)
                curveToRelative(-0.188f, 0.796f, 0.4f, 1.446f, 1.185f, 1.446f)
                curveToRelative(1.422f, 0f, 2.515f, -1.5f, 2.515f, -3.664f)
                curveToRelative(0f, -1.915f, -1.377f, -3.254f, -3.342f, -3.254f)
                curveToRelative(-2.276f, 0f, -3.612f, 1.707f, -3.612f, 3.471f)
                curveToRelative(0f, 0.688f, 0.265f, 1.425f, 0.595f, 1.826f)
                arcToRelative(0.24f, 0.24f, 0f, false, true, 0.056f, 0.23f)
                curveToRelative(-0.061f, 0.252f, -0.196f, 0.796f, -0.222f, 0.907f)
                curveToRelative(-0.035f, 0.146f, -0.116f, 0.177f, -0.268f, 0.107f)
                curveToRelative(-1f, -0.465f, -1.624f, -1.926f, -1.624f, -3.1f)
                curveToRelative(0f, -2.523f, 1.834f, -4.84f, 5.286f, -4.84f)
                curveToRelative(2.775f, 0f, 4.932f, 1.977f, 4.932f, 4.62f)
                curveToRelative(0f, 2.757f, -1.739f, 4.976f, -4.151f, 4.976f)
                curveToRelative(-0.811f, 0f, -1.573f, -0.421f, -1.834f, -0.919f)
                lineToRelative(-0.498f, 1.902f)
                curveToRelative(-0.181f, 0.695f, -0.669f, 1.566f, -0.995f, 2.097f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
            }
        }.build()
        
        return _Pinterest!!
    }

private var _Pinterest: ImageVector? = null

