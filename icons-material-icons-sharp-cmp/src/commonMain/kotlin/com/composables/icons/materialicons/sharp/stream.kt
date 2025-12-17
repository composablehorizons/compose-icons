package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Stream: ImageVector
    get() {
        if (_Stream != null) return _Stream!!
        
        _Stream = ImageVector.Builder(
            name = "stream",
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
                        moveTo(22f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 20f, 14f)
                        arcTo(2f, 2f, 0f, false, true, 18f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 22f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 4f, 14f)
                        arcTo(2f, 2f, 0f, false, true, 2f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 6f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 20f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 22f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 20f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.943087f, 8.61904f)
                        lineTo(18.34747f, 4.2270985f)
                        lineTo(19.759668f, 5.643298f)
                        lineTo(15.355287f, 10.035239f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.32f, 9.68f)
                        lineTo(8.63f, 10f)
                        lineTo(10.05f, 8.59f)
                        lineTo(6.03f, 4.55f)
                        lineTo(6.02f, 4.55f)
                        lineTo(5.71f, 4.23f)
                        lineTo(4.29f, 5.64f)
                        lineTo(8.31f, 9.69f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.41f, 13.94f)
                        lineTo(14f, 15.35f)
                        lineTo(17.99f, 19.36f)
                        lineTo(18.34f, 19.71f)
                        lineTo(19.76f, 18.3f)
                        lineTo(15.77f, 14.29f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.59f, 13.95f)
                        lineTo(4.56f, 17.96f)
                        lineTo(4.24f, 18.29f)
                        lineTo(5.65f, 19.7f)
                        lineTo(9.68f, 15.68f)
                        lineTo(10.01f, 15.36f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Stream!!
    }

private var _Stream: ImageVector? = null

