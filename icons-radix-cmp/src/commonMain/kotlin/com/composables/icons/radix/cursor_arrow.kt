package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CursorArrow: ImageVector
    get() {
        if (_CursorArrow != null) return _CursorArrow!!
        
        _CursorArrow = ImageVector.Builder(
            name = "cursor-arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.29199f, 0.0488633f)
                curveTo(3.46998f, -0.0324273f, 3.67922f, -0.00204229f, 3.82715f, 0.126012f)
                lineTo(12.8584f, 7.95023f)
                curveTo(13.013f, 8.08416f, 13.0709f, 8.29901f, 13.0039f, 8.49222f)
                curveTo(12.9367f, 8.68544f, 12.7581f, 8.81898f, 12.5537f, 8.82816f)
                lineTo(9.21875f, 8.97464f)
                lineTo(11.1504f, 13.2188f)
                curveTo(11.2648f, 13.4701f, 11.1536f, 13.7664f, 10.9023f, 13.8809f)
                lineTo(8.75f, 14.8614f)
                curveTo(8.4989f, 14.9756f, 8.2025f, 14.8652f, 8.08789f, 14.6143f)
                lineTo(6.15234f, 10.3692f)
                lineTo(3.8623f, 12.7852f)
                curveTo(3.72148f, 12.9337f, 3.50454f, 12.9821f, 3.31445f, 12.9063f)
                curveTo(3.12448f, 12.8304f, 3f, 12.646f, 3f, 12.4414f)
                verticalLineTo(0.503941f)
                lineTo(3.00488f, 0.431676f)
                curveTo(3.02912f, 0.26538f, 3.13621f, 0.120068f, 3.29199f, 0.0488633f)
                close()
                moveTo(4f, 11.1875f)
                lineTo(5.93848f, 9.14457f)
                lineTo(5.9834f, 9.10257f)
                curveTo(6.09412f, 9.0115f, 6.23945f, 8.97131f, 6.38281f, 8.99515f)
                curveTo(6.54677f, 9.02255f, 6.6869f, 9.13004f, 6.75586f, 9.28129f)
                lineTo(8.79004f, 13.7432f)
                lineTo(10.0332f, 13.1778f)
                lineTo(8.00195f, 8.71488f)
                curveTo(7.93331f, 8.56388f, 7.94376f, 8.38861f, 8.03027f, 8.24711f)
                curveTo(8.11701f, 8.10558f, 8.26877f, 8.01628f, 8.43457f, 8.00882f)
                lineTo(11.2549f, 7.88382f)
                lineTo(4f, 1.59769f)
                verticalLineTo(11.1875f)
                close()
            }
        }.build()
        
        return _CursorArrow!!
    }

private var _CursorArrow: ImageVector? = null

