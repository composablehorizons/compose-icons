package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PrescriptionBottle: ImageVector
    get() {
        if (_PrescriptionBottle != null) return _PrescriptionBottle!!
        
        _PrescriptionBottle = ImageVector.Builder(
            name = "prescription-bottle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(32f, 192f)
                horizontalLineToRelative(120f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(32f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(120f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(32f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(120f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.6f, 14.4f, 32f, 32f, 32f)
                horizontalLineToRelative(256f)
                curveToRelative(17.6f, 0f, 32f, -14.4f, 32f, -32f)
                verticalLineTo(128f)
                horizontalLineTo(32f)
                verticalLineToRelative(64f)
                close()
                moveTo(360f, 0f)
                horizontalLineTo(24f)
                curveTo(10.8f, 0f, 0f, 10.8f, 0f, 24f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.2f, 10.8f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.2f, 0f, 24f, -10.8f, 24f, -24f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.2f, -10.8f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _PrescriptionBottle!!
    }

private var _PrescriptionBottle: ImageVector? = null

