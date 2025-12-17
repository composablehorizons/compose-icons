package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sync_problem: ImageVector
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
                lineToRelative(-1.51f, 1.51f)
                curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f)
                horizontalLineTo(8.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.29f)
                curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-1.39f, 1.39f)
                curveTo(5.68f, 15.15f, 5f, 13.66f, 5f, 12f)
                curveToRelative(0f, -2.39f, 1.4f, -4.46f, 3.43f, -5.42f)
                curveToRelative(0.34f, -0.16f, 0.57f, -0.47f, 0.57f, -0.84f)
                verticalLineToRelative(-0.19f)
                curveToRelative(0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f)
                curveTo(4.92f, 5.99f, 3f, 8.77f, 3f, 12f)
                close()
                moveToRelative(8f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(8.79f, -13f)
                horizontalLineTo(15.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.29f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(1.39f, -1.39f)
                curveTo(18.32f, 8.85f, 19f, 10.34f, 19f, 12f)
                curveToRelative(0f, 2.39f, -1.4f, 4.46f, -3.43f, 5.42f)
                curveToRelative(-0.34f, 0.16f, -0.57f, 0.47f, -0.57f, 0.84f)
                verticalLineToRelative(0.18f)
                curveToRelative(0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f)
                curveTo(19.08f, 18.01f, 21f, 15.23f, 21f, 12f)
                curveToRelative(0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f)
                lineToRelative(1.51f, -1.51f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
        }.build()
        
        return _Sync_problem!!
    }

private var _Sync_problem: ImageVector? = null

