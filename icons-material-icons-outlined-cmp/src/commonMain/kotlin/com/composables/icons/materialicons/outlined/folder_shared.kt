package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Folder_shared: ImageVector
    get() {
        if (_Folder_shared != null) return _Folder_shared!!
        
        _Folder_shared = ImageVector.Builder(
            name = "folder_shared",
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
                moveTo(20f, 6f)
                horizontalLineToRelative(-8f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(2f, 18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(5.17f)
                lineToRelative(2f, 2f)
                horizontalLineTo(20f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(-5f, -5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(-4f, 4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.33f, -2.67f, -2f, -4f, -2f)
                reflectiveCurveToRelative(-4f, 0.67f, -4f, 2f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Folder_shared!!
    }

private var _Folder_shared: ImageVector? = null

