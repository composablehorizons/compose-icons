package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Data_object: ImageVector
    get() {
        if (_Data_object != null) return _Data_object!!
        
        _Data_object = ImageVector.Builder(
            name = "data_object",
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
                        moveTo(4f, 7f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(7f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                        verticalLineToRelative(-0.34f)
                        curveTo(5.16f, 11.42f, 6f, 10.3f, 6f, 9f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(4f)
                        horizontalLineTo(7f)
                        curveTo(5.35f, 4f, 4f, 5.35f, 4f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 10f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.3f, 0.84f, 2.42f, 2f, 2.83f)
                        verticalLineToRelative(0.34f)
                        curveToRelative(-1.16f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Data_object!!
    }

private var _Data_object: ImageVector? = null

