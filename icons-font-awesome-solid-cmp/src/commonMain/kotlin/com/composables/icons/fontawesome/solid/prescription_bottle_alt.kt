package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PrescriptionBottleAlt: ImageVector
    get() {
        if (_PrescriptionBottleAlt != null) return _PrescriptionBottleAlt!!
        
        _PrescriptionBottleAlt = ImageVector.Builder(
            name = "prescription-bottle-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveTo(32f, 480f)
                curveToRelative(0f, 17.6f, 14.4f, 32f, 32f, 32f)
                horizontalLineToRelative(256f)
                curveToRelative(17.6f, 0f, 32f, -14.4f, 32f, -32f)
                verticalLineTo(128f)
                horizontalLineTo(32f)
                verticalLineToRelative(352f)
                close()
                moveToRelative(64f, -184f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(56f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-56f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-48f)
                close()
            }
        }.build()
        
        return _PrescriptionBottleAlt!!
    }

private var _PrescriptionBottleAlt: ImageVector? = null

