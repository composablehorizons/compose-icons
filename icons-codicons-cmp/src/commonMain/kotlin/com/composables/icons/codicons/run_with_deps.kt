package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RunWithDeps: ImageVector
    get() {
        if (_RunWithDeps != null) return _RunWithDeps!!
        
        _RunWithDeps = ImageVector.Builder(
            name = "run-with-deps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.212f, 12.5f)
                curveTo(6.165f, 12.394f, 6.137f, 12.282f, 6.105f, 12.171f)
                lineTo(4.745f, 12.936f)
                curveTo(4.412f, 13.124f, 4f, 12.883f, 4f, 12.5f)
                verticalLineTo(3.50001f)
                curveTo(4f, 3.11801f, 4.412f, 2.87701f, 4.745f, 3.06401f)
                lineTo(12.745f, 7.56401f)
                curveTo(12.915f, 7.66001f, 13f, 7.83001f, 13f, 8.00001f)
                horizontalLineTo(14f)
                curveTo(14f, 7.49001f, 13.745f, 6.97901f, 13.235f, 6.69301f)
                lineTo(5.235f, 2.19301f)
                curveTo(4.235f, 1.63101f, 3f, 2.35301f, 3f, 3.50001f)
                verticalLineTo(12.5f)
                curveTo(3f, 13.647f, 4.235f, 14.37f, 5.235f, 13.807f)
                lineTo(6.013f, 13.369f)
                curveTo(6.029f, 13.068f, 6.09f, 12.773f, 6.212f, 12.499f)
                verticalLineTo(12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 10.5f)
                curveTo(16f, 9.67301f, 15.327f, 9.00001f, 14.5f, 9.00001f)
                horizontalLineTo(8.5f)
                curveTo(7.673f, 9.00001f, 7f, 9.67301f, 7f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(7f, 11.886f, 7.15f, 12.234f, 7.39f, 12.5f)
                curveTo(7.15f, 12.766f, 7f, 13.114f, 7f, 13.5f)
                verticalLineTo(14.5f)
                curveTo(7f, 15.327f, 7.673f, 16f, 8.5f, 16f)
                horizontalLineTo(10.5f)
                curveTo(10.886f, 16f, 11.234f, 15.85f, 11.5f, 15.61f)
                curveTo(11.766f, 15.85f, 12.114f, 16f, 12.5f, 16f)
                horizontalLineTo(14.5f)
                curveTo(15.327f, 16f, 16f, 15.327f, 16f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(16f, 13.114f, 15.85f, 12.766f, 15.61f, 12.5f)
                curveTo(15.85f, 12.234f, 16f, 11.886f, 16f, 11.5f)
                verticalLineTo(10.5f)
                close()
                moveTo(8f, 10.5f)
                curveTo(8f, 10.225f, 8.224f, 10f, 8.5f, 10f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 10f, 15f, 10.225f, 15f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(15f, 11.775f, 14.776f, 12f, 14.5f, 12f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 12f, 8f, 11.775f, 8f, 11.5f)
                verticalLineTo(10.5f)
                close()
                moveTo(10.5f, 15f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 15f, 8f, 14.775f, 8f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(8f, 13.225f, 8.224f, 13f, 8.5f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(14.5f)
                curveTo(11f, 14.775f, 10.776f, 15f, 10.5f, 15f)
                close()
                moveTo(15f, 14.5f)
                curveTo(15f, 14.775f, 14.776f, 15f, 14.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 15f, 12f, 14.775f, 12f, 14.5f)
                verticalLineTo(13f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 13f, 15f, 13.225f, 15f, 13.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()
        
        return _RunWithDeps!!
    }

private var _RunWithDeps: ImageVector? = null

