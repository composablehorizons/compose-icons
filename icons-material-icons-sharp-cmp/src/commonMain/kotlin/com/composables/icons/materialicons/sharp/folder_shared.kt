package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Folder_shared: ImageVector
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
                moveTo(22f, 6f)
                horizontalLineTo(12f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(6f)
                close()
                moveToRelative(-7f, 3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveToRelative(4f, 8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.33f, 2.67f, -2f, 4f, -2f)
                reflectiveCurveToRelative(4f, 0.67f, 4f, 2f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Folder_shared!!
    }

private var _Folder_shared: ImageVector? = null

