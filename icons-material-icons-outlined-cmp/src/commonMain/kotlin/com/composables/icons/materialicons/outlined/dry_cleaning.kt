package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Dry_cleaning: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.56f, 11.36f)
                        lineTo(13f, 8.44f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0f, -1.84f, -1.66f, -3.3f, -3.56f, -2.95f)
                        curveTo(10.26f, 2.27f, 9.29f, 3.22f, 9.06f, 4.4f)
                        curveTo(8.76f, 5.96f, 9.66f, 7.34f, 11f, 7.82f)
                        verticalLineToRelative(0.63f)
                        lineToRelative(-6.56f, 2.92f)
                        curveTo(3.56f, 11.75f, 3f, 12.62f, 3f, 13.57f)
                        verticalLineToRelative(0.01f)
                        curveTo(3f, 14.92f, 4.08f, 16f, 5.42f, 16f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(1.58f)
                        curveToRelative(1.34f, 0f, 2.42f, -1.08f, 2.42f, -2.42f)
                        verticalLineToRelative(-0.01f)
                        curveTo(21f, 12.62f, 20.44f, 11.75f, 19.56f, 11.36f)
                        close()
                        moveTo(15f, 20f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(20f)
                        close()
                        moveTo(18.58f, 14f)
                        horizontalLineTo(17f)
                        verticalLineToRelative(-1f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(5.42f)
                        curveToRelative(-0.46f, 0f, -0.58f, -0.65f, -0.17f, -0.81f)
                        lineToRelative(6.75f, -3f)
                        lineToRelative(6.75f, 3f)
                        curveTo(19.17f, 13.38f, 19.03f, 14f, 18.58f, 14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Dry_cleaning!!
    }

private var _Dry_cleaning: ImageVector? = null

