package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Print_disabled: ImageVector
    get() {
        if (_Print_disabled != null) return _Print_disabled!!
        
        _Print_disabled = ImageVector.Builder(
            name = "print_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.65f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(3.01f)
                horizontalLineTo(6f)
                verticalLineToRelative(0.35f)
                close()
                moveToRelative(1.01f, 1.01f)
                lineToRelative(9f, 8.99f)
                horizontalLineTo(22f)
                verticalLineToRelative(-5.99f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-8.34f)
                close()
                moveTo(19f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(1.41f, 1.6f)
                lineTo(0f, 3.01f)
                lineToRelative(5f, 5f)
                curveToRelative(-1.66f, 0f, -3f, 1.33f, -3f, 2.99f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(12f)
                lineToRelative(2.95f, 2.96f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.6f)
                close()
                moveTo(8f, 19.01f)
                verticalLineTo(15f)
                horizontalLineToRelative(4f)
                lineToRelative(4f, 4f)
                lineToRelative(-8f, 0.01f)
                close()
            }
        }.build()
        
        return _Print_disabled!!
    }

private var _Print_disabled: ImageVector? = null

