package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GearWideConnected: ImageVector
    get() {
        if (_GearWideConnected != null) return _GearWideConnected!!
        
        _GearWideConnected = ImageVector.Builder(
            name = "gear-wide-connected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.068f, 0.727f)
                curveToRelative(0.243f, -0.97f, 1.62f, -0.97f, 1.864f, 0f)
                lineToRelative(0.071f, 0.286f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, 1.622f, 0.434f)
                lineToRelative(0.205f, -0.211f)
                curveToRelative(0.695f, -0.719f, 1.888f, -0.03f, 1.613f, 0.931f)
                lineToRelative(-0.08f, 0.284f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, 1.187f, 1.187f)
                lineToRelative(0.283f, -0.081f)
                curveToRelative(0.96f, -0.275f, 1.65f, 0.918f, 0.931f, 1.613f)
                lineToRelative(-0.211f, 0.205f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, 0.434f, 1.622f)
                lineToRelative(0.286f, 0.071f)
                curveToRelative(0.97f, 0.243f, 0.97f, 1.62f, 0f, 1.864f)
                lineToRelative(-0.286f, 0.071f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, -0.434f, 1.622f)
                lineToRelative(0.211f, 0.205f)
                curveToRelative(0.719f, 0.695f, 0.03f, 1.888f, -0.931f, 1.613f)
                lineToRelative(-0.284f, -0.08f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, -1.187f, 1.187f)
                lineToRelative(0.081f, 0.283f)
                curveToRelative(0.275f, 0.96f, -0.918f, 1.65f, -1.613f, 0.931f)
                lineToRelative(-0.205f, -0.211f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, -1.622f, 0.434f)
                lineToRelative(-0.071f, 0.286f)
                curveToRelative(-0.243f, 0.97f, -1.62f, 0.97f, -1.864f, 0f)
                lineToRelative(-0.071f, -0.286f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, -1.622f, -0.434f)
                lineToRelative(-0.205f, 0.211f)
                curveToRelative(-0.695f, 0.719f, -1.888f, 0.03f, -1.613f, -0.931f)
                lineToRelative(0.08f, -0.284f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, -1.186f, -1.187f)
                lineToRelative(-0.284f, 0.081f)
                curveToRelative(-0.96f, 0.275f, -1.65f, -0.918f, -0.931f, -1.613f)
                lineToRelative(0.211f, -0.205f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, -0.434f, -1.622f)
                lineToRelative(-0.286f, -0.071f)
                curveToRelative(-0.97f, -0.243f, -0.97f, -1.62f, 0f, -1.864f)
                lineToRelative(0.286f, -0.071f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, 0.434f, -1.622f)
                lineToRelative(-0.211f, -0.205f)
                curveToRelative(-0.719f, -0.695f, -0.03f, -1.888f, 0.931f, -1.613f)
                lineToRelative(0.284f, 0.08f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, 1.187f, -1.186f)
                lineToRelative(-0.081f, -0.284f)
                curveToRelative(-0.275f, -0.96f, 0.918f, -1.65f, 1.613f, -0.931f)
                lineToRelative(0.205f, 0.211f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, 1.622f, -0.434f)
                close()
                moveTo(12.973f, 8.5f)
                horizontalLineTo(8.25f)
                lineToRelative(-2.834f, 3.779f)
                arcTo(4.998f, 4.998f, 0f, false, false, 12.973f, 8.5f)
                moveToRelative(0f, -1f)
                arcToRelative(4.998f, 4.998f, 0f, false, false, -7.557f, -3.779f)
                lineToRelative(2.834f, 3.78f)
                close()
                moveTo(5.048f, 3.967f)
                lineToRelative(-0.087f, 0.065f)
                close()
                moveToRelative(-0.431f, 0.355f)
                arcTo(4.98f, 4.98f, 0f, false, false, 3.002f, 8f)
                curveToRelative(0f, 1.455f, 0.622f, 2.765f, 1.615f, 3.678f)
                lineTo(7.375f, 8f)
                close()
                moveToRelative(0.344f, 7.646f)
                lineToRelative(0.087f, 0.065f)
                close()
            }
        }.build()
        
        return _GearWideConnected!!
    }

private var _GearWideConnected: ImageVector? = null

