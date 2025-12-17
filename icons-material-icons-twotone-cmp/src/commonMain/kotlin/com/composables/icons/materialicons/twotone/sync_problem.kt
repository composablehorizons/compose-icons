package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sync_problem: ImageVector
    get() {
        if (_Sync_problem != null) return _Sync_problem!!
        
        _Sync_problem = ImageVector.Builder(
            name = "sync_problem",
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
                moveTo(3f, 12f)
                curveToRelative(0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f)
                lineTo(3f, 20f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                lineToRelative(-2.24f, 2.24f)
                curveTo(5.68f, 15.15f, 5f, 13.66f, 5f, 12f)
                curveToRelative(0f, -2.61f, 1.67f, -4.83f, 4f, -5.65f)
                verticalLineTo(4.26f)
                curveTo(5.55f, 5.15f, 3f, 8.27f, 3f, 12f)
                close()
                moveToRelative(8f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineToRelative(2.24f, -2.24f)
                curveTo(18.32f, 8.85f, 19f, 10.34f, 19f, 12f)
                curveToRelative(0f, 2.61f, -1.67f, 4.83f, -4f, 5.65f)
                verticalLineToRelative(2.09f)
                curveToRelative(3.45f, -0.89f, 6f, -4.01f, 6f, -7.74f)
                curveToRelative(0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f)
                lineTo(21f, 4f)
                close()
                moveToRelative(-10f, 9f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Sync_problem!!
    }

private var _Sync_problem: ImageVector? = null

