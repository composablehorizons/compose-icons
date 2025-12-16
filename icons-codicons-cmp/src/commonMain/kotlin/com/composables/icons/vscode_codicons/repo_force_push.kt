package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RepoForcePush: ImageVector
    get() {
        if (_RepoForcePush != null) return _RepoForcePush!!
        
        _RepoForcePush = ImageVector.Builder(
            name = "repo-force-push",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.14602f, 7.85302f)
                curveTo(3.95102f, 7.65802f, 3.95102f, 7.34102f, 4.14602f, 7.14602f)
                lineTo(6.99902f, 4.29202f)
                verticalLineTo(2.70902f)
                lineTo(4.84902f, 4.84902f)
                curveTo(4.75402f, 4.94902f, 4.62702f, 4.99902f, 4.49902f, 4.99902f)
                curveTo(4.37102f, 4.99902f, 4.24402f, 4.94902f, 4.14902f, 4.84902f)
                curveTo(4.04902f, 4.75402f, 3.99902f, 4.62602f, 3.99902f, 4.49902f)
                curveTo(3.99902f, 4.37202f, 4.04902f, 4.24402f, 4.14902f, 4.14902f)
                lineTo(7.14902f, 1.14902f)
                curveTo(7.24402f, 1.04902f, 7.37102f, 0.999023f, 7.49902f, 0.999023f)
                curveTo(7.62702f, 0.999023f, 7.75402f, 1.04902f, 7.84902f, 1.14902f)
                lineTo(10.849f, 4.14902f)
                curveTo(10.949f, 4.24402f, 10.999f, 4.37102f, 10.999f, 4.49902f)
                curveTo(10.999f, 4.62702f, 10.949f, 4.75402f, 10.849f, 4.84902f)
                curveTo(10.754f, 4.94902f, 10.626f, 4.99902f, 10.499f, 4.99902f)
                curveTo(10.372f, 4.99902f, 10.244f, 4.94902f, 10.149f, 4.84902f)
                lineTo(7.99902f, 2.70902f)
                verticalLineTo(4.29202f)
                lineTo(10.853f, 7.14602f)
                curveTo(11.048f, 7.34102f, 11.048f, 7.65802f, 10.853f, 7.85302f)
                curveTo(10.755f, 7.95002f, 10.627f, 7.99902f, 10.499f, 7.99902f)
                curveTo(10.371f, 7.99902f, 10.243f, 7.95102f, 10.145f, 7.85302f)
                lineTo(7.99902f, 5.70702f)
                verticalLineTo(9.50002f)
                curveTo(7.99902f, 9.78002f, 7.77902f, 10f, 7.49902f, 10f)
                curveTo(7.21902f, 10f, 6.99902f, 9.78002f, 6.99902f, 9.50002f)
                verticalLineTo(5.70702f)
                lineTo(4.85302f, 7.85302f)
                curveTo(4.65802f, 8.04802f, 4.34102f, 8.04802f, 4.14602f, 7.85302f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.95f, 13f)
                horizontalLineTo(12.5f)
                curveTo(12.78f, 13f, 13f, 13.22f, 13f, 13.5f)
                curveTo(13f, 13.78f, 12.78f, 14f, 12.5f, 14f)
                horizontalLineTo(9.95f)
                curveTo(9.72f, 15.14f, 8.71f, 16f, 7.5f, 16f)
                curveTo(6.29f, 16f, 5.28f, 15.14f, 5.05f, 14f)
                horizontalLineTo(2.5f)
                curveTo(2.22f, 14f, 2f, 13.78f, 2f, 13.5f)
                curveTo(2f, 13.22f, 2.22f, 13f, 2.5f, 13f)
                horizontalLineTo(5.05f)
                curveTo(5.28f, 11.86f, 6.29f, 11f, 7.5f, 11f)
                curveTo(8.71f, 11f, 9.72f, 11.86f, 9.95f, 13f)
                close()
                moveTo(7.5f, 15f)
                curveTo(8.15f, 15f, 8.71f, 14.58f, 8.91f, 14f)
                curveTo(8.97f, 13.84f, 9f, 13.68f, 9f, 13.5f)
                curveTo(9f, 13.32f, 8.97f, 13.16f, 8.91f, 13f)
                curveTo(8.71f, 12.42f, 8.15f, 12f, 7.5f, 12f)
                curveTo(6.85f, 12f, 6.29f, 12.42f, 6.09f, 13f)
                curveTo(6.03f, 13.16f, 6f, 13.32f, 6f, 13.5f)
                curveTo(6f, 13.68f, 6.03f, 13.84f, 6.09f, 14f)
                curveTo(6.29f, 14.58f, 6.85f, 15f, 7.5f, 15f)
                close()
            }
        }.build()
        
        return _RepoForcePush!!
    }

private var _RepoForcePush: ImageVector? = null

