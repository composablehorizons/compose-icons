package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Qr_code: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 11f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(3f)
                        horizontalLineTo(3f)
                        verticalLineTo(11f)
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
                        moveTo(3f, 21f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-8f)
                        horizontalLineTo(3f)
                        verticalLineTo(21f)
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
                        moveTo(13f, 3f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(3f)
                        horizontalLineTo(13f)
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
                        moveTo(19f, 19f)
                        horizontalLineTo(21f)
                        verticalLineTo(21f)
                        horizontalLineTo(19f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 13f)
                        horizontalLineTo(15f)
                        verticalLineTo(15f)
                        horizontalLineTo(13f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 15f)
                        horizontalLineTo(17f)
                        verticalLineTo(17f)
                        horizontalLineTo(15f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 17f)
                        horizontalLineTo(15f)
                        verticalLineTo(19f)
                        horizontalLineTo(13f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 19f)
                        horizontalLineTo(17f)
                        verticalLineTo(21f)
                        horizontalLineTo(15f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 17f)
                        horizontalLineTo(19f)
                        verticalLineTo(19f)
                        horizontalLineTo(17f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 13f)
                        horizontalLineTo(19f)
                        verticalLineTo(15f)
                        horizontalLineTo(17f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 15f)
                        horizontalLineTo(21f)
                        verticalLineTo(17f)
                        horizontalLineTo(19f)
                        verticalLineTo(15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Qr_code!!
    }

private var _Qr_code: ImageVector? = null

