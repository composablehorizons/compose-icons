package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`10mp`: ImageVector
    get() {
        if (_10mp != null) return _10mp!!
        
        _10mp = ImageVector.Builder(
            name = "10mp",
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
                        moveTo(13.5f, 7f)
                        horizontalLineTo(15f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineTo(7f)
                        close()
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(11.75f, 18.5f)
                        lineTo(11.75f, 18.5f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(2.25f)
                        curveTo(10f, 16.66f, 9.66f, 17f, 9.25f, 17f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(3.75f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        horizontalLineToRelative(0f)
                        curveTo(6.34f, 18.5f, 6f, 18.16f, 6f, 17.75f)
                        verticalLineTo(13.5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4.5f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(4.25f)
                        curveTo(12.5f, 18.16f, 12.16f, 18.5f, 11.75f, 18.5f)
                        close()
                        moveTo(14.25f, 18.5f)
                        lineTo(14.25f, 18.5f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineTo(13.5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineTo(17f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(16f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(0.75f)
                        curveTo(15f, 18.16f, 14.66f, 18.5f, 14.25f, 18.5f)
                        close()
                        moveTo(10f, 6.5f)
                        verticalLineToRelative(4.25f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineTo(7f)
                        horizontalLineTo(7.75f)
                        curveTo(7.34f, 7f, 7f, 6.66f, 7f, 6.25f)
                        verticalLineToRelative(0f)
                        curveTo(7f, 5.84f, 7.34f, 5.5f, 7.75f, 5.5f)
                        horizontalLineTo(9f)
                        curveTo(9.55f, 5.5f, 10f, 5.95f, 10f, 6.5f)
                        close()
                        moveTo(16.5f, 10.5f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(13f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(2.5f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(10.5f)
                        close()
                        moveTo(15f, 14f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(1.5f)
                        horizontalLineTo(15f)
                        verticalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _10mp!!
    }

private var _10mp: ImageVector? = null

