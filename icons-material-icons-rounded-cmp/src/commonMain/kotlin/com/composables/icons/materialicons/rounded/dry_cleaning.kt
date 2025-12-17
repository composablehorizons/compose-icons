package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Dry_cleaning: ImageVector
    get() {
        if (_Dry_cleaning != null) return _Dry_cleaning!!
        
        _Dry_cleaning = ImageVector.Builder(
            name = "dry_cleaning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.56f, 11.36f)
                    lineTo(13f, 8.44f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    curveToRelative(0.38f, 0f, 0.72f, 0.22f, 0.88f, 0.53f)
                    curveTo(13.04f, 4.84f, 13.39f, 5f, 13.73f, 5f)
                    curveToRelative(0.74f, 0f, 1.26f, -0.79f, 0.91f, -1.44f)
                    curveToRelative(-0.6f, -1.1f, -1.86f, -1.78f, -3.24f, -1.51f)
                    curveToRelative(-1.17f, 0.23f, -2.12f, 1.2f, -2.34f, 2.37f)
                    curveTo(8.77f, 5.98f, 9.67f, 7.35f, 11f, 7.82f)
                    verticalLineToRelative(0.63f)
                    lineToRelative(-6.56f, 2.92f)
                    curveTo(3.56f, 11.75f, 3f, 12.62f, 3f, 13.57f)
                    verticalLineToRelative(0.01f)
                    curveTo(3f, 14.92f, 4.08f, 16f, 5.42f, 16f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(6f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(1.58f)
                    curveToRelative(1.34f, 0f, 2.42f, -1.08f, 2.42f, -2.42f)
                    verticalLineToRelative(-0.01f)
                    curveTo(21f, 12.62f, 20.44f, 11.75f, 19.56f, 11.36f)
                    close()
                    moveTo(18.58f, 14f)
                    horizontalLineToRelative(-1.86f)
                    curveToRelative(-0.35f, -0.6f, -0.98f, -1f, -1.72f, -1f)
                    horizontalLineTo(9f)
                    curveToRelative(-0.74f, 0f, -1.38f, 0.4f, -1.72f, 1f)
                    horizontalLineTo(5.42f)
                    curveToRelative(-0.46f, 0f, -0.58f, -0.65f, -0.17f, -0.81f)
                    lineToRelative(6.75f, -3f)
                    lineToRelative(6.75f, 3f)
                    curveTo(19.17f, 13.38f, 19.03f, 14f, 18.58f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Dry_cleaning!!
    }

private var _Dry_cleaning: ImageVector? = null

