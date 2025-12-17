package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitPullRequestDone: ImageVector
    get() {
        if (_GitPullRequestDone != null) return _GitPullRequestDone!!
        
        _GitPullRequestDone = ImageVector.Builder(
            name = "git-pull-request-done",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 7f)
                curveTo(13.985f, 7f, 16f, 9.015f, 16f, 11.5f)
                curveTo(16f, 13.985f, 13.985f, 16f, 11.5f, 16f)
                curveTo(9.015f, 16f, 7f, 13.985f, 7f, 11.5f)
                curveTo(7f, 9.015f, 9.015f, 7f, 11.5f, 7f)
                close()
                moveTo(13.8535f, 10.1465f)
                curveTo(13.6583f, 9.95123f, 13.3417f, 9.95124f, 13.1465f, 10.1465f)
                lineTo(11f, 12.293f)
                lineTo(9.85352f, 11.1465f)
                curveTo(9.65826f, 10.9512f, 9.34175f, 10.9512f, 9.14648f, 11.1465f)
                curveTo(8.95122f, 11.3417f, 8.95122f, 11.6583f, 9.14648f, 11.8535f)
                lineTo(10.6465f, 13.3535f)
                curveTo(10.8417f, 13.5488f, 11.1583f, 13.5488f, 11.3535f, 13.3535f)
                lineTo(13.8535f, 10.8535f)
                curveTo(14.0488f, 10.6583f, 14.0488f, 10.3417f, 13.8535f, 10.1465f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 1f)
                curveTo(4.88f, 1f, 6f, 2.12f, 6f, 3.5f)
                curveTo(6f, 4.71f, 5.14f, 5.7202f, 4f, 5.9502f)
                verticalLineTo(10.0508f)
                curveTo(5.14f, 10.2828f, 6f, 11.292f, 6f, 12.5f)
                curveTo(6f, 13.879f, 4.878f, 15f, 3.5f, 15f)
                curveTo(2.122f, 15f, 1f, 13.879f, 1f, 12.5f)
                curveTo(1f, 11.293f, 1.86f, 10.2828f, 3f, 10.0508f)
                verticalLineTo(5.9502f)
                curveTo(1.86f, 5.7202f, 1f, 4.71f, 1f, 3.5f)
                curveTo(1f, 2.12f, 2.12f, 1f, 3.5f, 1f)
                close()
                moveTo(3.5f, 11f)
                curveTo(2.673f, 11f, 2f, 11.673f, 2f, 12.5f)
                curveTo(2f, 13.327f, 2.673f, 14f, 3.5f, 14f)
                curveTo(4.327f, 14f, 5f, 13.327f, 5f, 12.5f)
                curveTo(5f, 11.673f, 4.327f, 11f, 3.5f, 11f)
                close()
                moveTo(3.5f, 2f)
                curveTo(2.67f, 2f, 2f, 2.67f, 2f, 3.5f)
                curveTo(2f, 4.33f, 2.67f, 5f, 3.5f, 5f)
                curveTo(4.33f, 5f, 5f, 4.33f, 5f, 3.5f)
                curveTo(5f, 2.67f, 4.33f, 2f, 3.5f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.15039f, 1.15039f)
                curveTo(9.34039f, 0.950391f, 9.65961f, 0.950391f, 9.84961f, 1.15039f)
                curveTo(10.0496f, 1.34039f, 10.0496f, 1.65961f, 9.84961f, 1.84961f)
                lineTo(8.70996f, 3f)
                horizontalLineTo(10.5f)
                curveTo(11.88f, 3f, 13f, 4.12f, 13f, 5.5f)
                verticalLineTo(6.21289f)
                curveTo(12.677f, 6.1209f, 12.344f, 6.05639f, 12f, 6.02539f)
                verticalLineTo(5.5f)
                curveTo(12f, 4.67f, 11.33f, 4f, 10.5f, 4f)
                horizontalLineTo(8.70996f)
                lineTo(9.84961f, 5.15039f)
                curveTo(10.0496f, 5.34039f, 10.0496f, 5.65961f, 9.84961f, 5.84961f)
                curveTo(9.65961f, 6.04961f, 9.34039f, 6.04961f, 9.15039f, 5.84961f)
                lineTo(7.15039f, 3.84961f)
                curveTo(6.95039f, 3.65961f, 6.95039f, 3.34039f, 7.15039f, 3.15039f)
                lineTo(9.15039f, 1.15039f)
                close()
            }
        }.build()
        
        return _GitPullRequestDone!!
    }

private var _GitPullRequestDone: ImageVector? = null

