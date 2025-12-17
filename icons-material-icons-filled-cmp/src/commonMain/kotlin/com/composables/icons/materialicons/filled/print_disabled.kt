package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Print_disabled: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.1f, 17f)
                horizontalLineTo(22f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.7f, -1.3f, -3f, -3f, -3f)
                horizontalLineToRelative(-9f)
                lineToRelative(9.1f, 9f)
                close()
                moveToRelative(-0.1f, -7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(-1f, -3f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(1.1f)
                lineTo(9f, 7f)
                close()
                moveTo(1.2f, 1.8f)
                lineTo(0f, 3f)
                lineToRelative(4.9f, 5f)
                curveTo(3.3f, 8.1f, 2f, 9.4f, 2f, 11f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(11.9f)
                lineToRelative(3f, 3f)
                lineToRelative(1.3f, -1.3f)
                lineToRelative(-21f, -20.9f)
                close()
                moveTo(8f, 19f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2.9f)
                lineToRelative(5f, 5f)
                horizontalLineTo(8f)
                close()
            }
        }.build()
        
        return _Print_disabled!!
    }

private var _Print_disabled: ImageVector? = null

