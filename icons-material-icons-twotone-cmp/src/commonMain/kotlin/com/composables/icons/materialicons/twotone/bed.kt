package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Bed: ImageVector
    get() {
        if (_Bed != null) return _Bed!!
        
        _Bed = ImageVector.Builder(
            name = "bed",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(19f, 8f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 8f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(6f)
                        curveTo(5.45f, 7f, 5f, 7.45f, 5f, 8f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 12f)
                        horizontalLineTo(5f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2f)
                        curveTo(20f, 12.45f, 19.55f, 12f, 19f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 10.78f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(-0.77f, 0f, -1.47f, 0.3f, -2f, 0.78f)
                        curveTo(11.47f, 5.3f, 10.77f, 5f, 10f, 5f)
                        horizontalLineTo(6f)
                        curveTo(4.35f, 5f, 3f, 6.35f, 3f, 8f)
                        verticalLineToRelative(2.78f)
                        curveTo(2.39f, 11.33f, 2f, 12.12f, 2f, 13f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-6f)
                        curveTo(22f, 12.12f, 21.61f, 11.33f, 21f, 10.78f)
                        close()
                        moveTo(13f, 8f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-6f)
                        verticalLineTo(8f)
                        close()
                        moveTo(5f, 8f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        verticalLineTo(8f)
                        close()
                        moveTo(20f, 15f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(14f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bed!!
    }

private var _Bed: ImageVector? = null

