package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Flourescent: ImageVector
    get() {
        if (_Flourescent != null) return _Flourescent!!
        
        _Flourescent = ImageVector.Builder(
            name = "flourescent",
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
                        moveTo(5f, 9f)
                        horizontalLineTo(19f)
                        verticalLineTo(15f)
                        horizontalLineTo(5f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 2f)
                        horizontalLineTo(13f)
                        verticalLineTo(5f)
                        horizontalLineTo(11f)
                        verticalLineTo(2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.286373f, 6.3988676f)
                        lineTo(19.076056f, 4.596484f)
                        lineTo(20.495256f, 6.005684f)
                        lineTo(18.705572f, 7.808068f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 19f)
                        horizontalLineTo(13f)
                        verticalLineTo(22f)
                        horizontalLineTo(11f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.29f, 17.71f)
                        lineTo(19.08f, 19.51f)
                        lineTo(20.5f, 18.09f)
                        lineTo(18.7f, 16.3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.4947128f, 6.0090933f)
                        lineTo(4.901842f, 4.601964f)
                        lineTo(6.6908054f, 6.390927f)
                        lineTo(5.283676f, 7.798056f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.4921608f, 18.076225f)
                        lineTo(5.294545f, 16.286541f)
                        lineTo(6.703744f, 17.70574f)
                        lineTo(4.9013605f, 19.495424f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flourescent!!
    }

private var _Flourescent: ImageVector? = null

