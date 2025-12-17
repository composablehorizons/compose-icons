package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Qr_code: ImageVector
    get() {
        if (_Qr_code != null) return _Qr_code!!
        
        _Qr_code = ImageVector.Builder(
            name = "qr_code",
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
                        moveTo(5f, 11f)
                        horizontalLineToRelative(4f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(4f)
                        curveTo(3f, 10.1f, 3.9f, 11f, 5f, 11f)
                        close()
                        moveTo(5f, 5f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 21f)
                        horizontalLineToRelative(4f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(5f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(4f)
                        curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                        close()
                        moveTo(5f, 15f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(5f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 5f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(4f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4f)
                        curveTo(13.9f, 3f, 13f, 3.9f, 13f, 5f)
                        close()
                        moveTo(19f, 9f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 20.5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(1f)
                        curveTo(20.78f, 21f, 21f, 20.78f, 21f, 20.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 13.5f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                        horizontalLineToRelative(-1f)
                        curveTo(13.22f, 13f, 13f, 13.22f, 13f, 13.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.5f, 15f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-1f)
                        curveTo(17f, 15.22f, 16.78f, 15f, 16.5f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 17.5f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                        horizontalLineToRelative(-1f)
                        curveTo(13.22f, 17f, 13f, 17.22f, 13f, 17.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.5f, 21f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        verticalLineToRelative(1f)
                        curveTo(15f, 20.78f, 15.22f, 21f, 15.5f, 21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.5f, 19f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        verticalLineToRelative(1f)
                        curveTo(17f, 18.78f, 17.22f, 19f, 17.5f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.5f, 13f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-1f)
                        curveTo(19f, 13.22f, 18.78f, 13f, 18.5f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.5f, 17f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        verticalLineToRelative(1f)
                        curveTo(19f, 16.78f, 19.22f, 17f, 19.5f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Qr_code!!
    }

private var _Qr_code: ImageVector? = null

