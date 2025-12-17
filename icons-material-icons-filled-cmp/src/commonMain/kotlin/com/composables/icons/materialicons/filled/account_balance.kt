package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Account_balance: ImageVector
    get() {
        if (_Account_balance != null) return _Account_balance!!
        
        _Account_balance = ImageVector.Builder(
            name = "account_balance",
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
                        moveTo(4f, 10f)
                        horizontalLineTo(7f)
                        verticalLineTo(17f)
                        horizontalLineTo(4f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.5f, 10f)
                        horizontalLineTo(13.5f)
                        verticalLineTo(17f)
                        horizontalLineTo(10.5f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 19f)
                        horizontalLineTo(22f)
                        verticalLineTo(22f)
                        horizontalLineTo(2f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 10f)
                        horizontalLineTo(20f)
                        verticalLineTo(17f)
                        horizontalLineTo(17f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 1f)
                        lineTo(2f, 6f)
                        lineTo(2f, 8f)
                        lineTo(22f, 8f)
                        lineTo(22f, 6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Account_balance!!
    }

private var _Account_balance: ImageVector? = null

