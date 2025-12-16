package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Share1: ImageVector
    get() {
        if (_Share1 != null) return _Share1!!
        
        _Share1 = ImageVector.Builder(
            name = "share-1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 7.50003f)
                curveTo(1f, 6.11932f, 2.11929f, 5.00003f, 3.5f, 5.00003f)
                curveTo(4.46036f, 5.00003f, 5.2922f, 5.54261f, 5.71094f, 6.33694f)
                lineTo(9.10449f, 4.21683f)
                curveTo(9.03664f, 3.98975f, 9f, 3.74917f, 9f, 3.50003f)
                curveTo(9f, 2.11932f, 10.1193f, 1.00003f, 11.5f, 1.00003f)
                curveTo(12.8807f, 1.00003f, 14f, 2.11932f, 14f, 3.50003f)
                curveTo(14f, 4.88074f, 12.8807f, 6.00003f, 11.5f, 6.00003f)
                curveTo(10.6915f, 6.00003f, 9.97456f, 5.61485f, 9.51758f, 5.01956f)
                lineTo(5.98437f, 7.22855f)
                curveTo(5.99401f, 7.31775f, 6f, 7.40826f, 6f, 7.50003f)
                curveTo(6f, 7.59213f, 5.99408f, 7.68297f, 5.98437f, 7.77249f)
                lineTo(9.51758f, 9.98148f)
                curveTo(9.97453f, 9.38583f, 10.6913f, 9.00003f, 11.5f, 9.00003f)
                curveTo(12.8807f, 9.00003f, 14f, 10.1193f, 14f, 11.5f)
                curveTo(14f, 12.8807f, 12.8807f, 14f, 11.5f, 14f)
                curveTo(10.1193f, 14f, 9f, 12.8807f, 9f, 11.5f)
                curveTo(9f, 11.2512f, 9.03681f, 11.011f, 9.10449f, 10.7842f)
                lineTo(5.71094f, 8.66409f)
                curveTo(5.29207f, 9.45801f, 4.46005f, 10f, 3.5f, 10f)
                curveTo(2.11929f, 10f, 1f, 8.88074f, 1f, 7.50003f)
                close()
                moveTo(10f, 3.50003f)
                curveTo(10f, 4.32846f, 10.6716f, 5.00003f, 11.5f, 5.00003f)
                curveTo(12.3284f, 5.00003f, 13f, 4.32846f, 13f, 3.50003f)
                curveTo(13f, 2.6716f, 12.3284f, 2.00003f, 11.5f, 2.00003f)
                curveTo(10.6716f, 2.00003f, 10f, 2.6716f, 10f, 3.50003f)
                close()
                moveTo(2f, 7.50003f)
                curveTo(2f, 8.32846f, 2.67157f, 9.00003f, 3.5f, 9.00003f)
                curveTo(4.32843f, 9.00003f, 5f, 8.32846f, 5f, 7.50003f)
                curveTo(5f, 6.6716f, 4.32843f, 6.00003f, 3.5f, 6.00003f)
                curveTo(2.67157f, 6.00003f, 2f, 6.6716f, 2f, 7.50003f)
                close()
                moveTo(11.5f, 13f)
                curveTo(12.3284f, 13f, 13f, 12.3285f, 13f, 11.5f)
                curveTo(13f, 10.6716f, 12.3284f, 10f, 11.5f, 10f)
                curveTo(10.6716f, 10f, 10f, 10.6716f, 10f, 11.5f)
                curveTo(10f, 12.3285f, 10.6716f, 13f, 11.5f, 13f)
                close()
            }
        }.build()
        
        return _Share1!!
    }

private var _Share1: ImageVector? = null

