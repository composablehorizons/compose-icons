package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Import_export: ImageVector
    get() {
        if (_Import_export != null) return _Import_export!!
        
        _Import_export = ImageVector.Builder(
            name = "import_export",
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
                moveTo(8.65f, 3.35f)
                lineTo(5.86f, 6.14f)
                curveToRelative(-0.32f, 0.31f, -0.1f, 0.85f, 0.35f, 0.85f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(6.99f)
                horizontalLineToRelative(1.79f)
                curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineTo(9.35f, 3.35f)
                curveToRelative(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0f)
                close()
                moveTo(16f, 17.01f)
                verticalLineTo(11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6.01f)
                horizontalLineToRelative(-1.79f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(2.79f, 2.78f)
                curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0f)
                lineToRelative(2.79f, -2.78f)
                curveToRelative(0.32f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f)
                horizontalLineTo(16f)
                close()
            }
        }.build()
        
        return _Import_export!!
    }

private var _Import_export: ImageVector? = null

