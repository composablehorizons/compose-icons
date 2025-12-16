package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitBranchChanges: ImageVector
    get() {
        if (_GitBranchChanges != null) return _GitBranchChanges!!
        
        _GitBranchChanges = ImageVector.Builder(
            name = "git-branch-changes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.22f, 6.502f)
                curveTo(9.522f, 6.364f, 9.838f, 6.253f, 10.166f, 6.171f)
                curveTo(10.063f, 5.968f, 10f, 5.742f, 10f, 5.5f)
                curveTo(10f, 4.673f, 10.673f, 4f, 11.5f, 4f)
                curveTo(12.327f, 4f, 13f, 4.673f, 13f, 5.5f)
                curveTo(13f, 5.743f, 12.936f, 5.968f, 12.834f, 6.171f)
                curveTo(13.162f, 6.253f, 13.478f, 6.364f, 13.78f, 6.502f)
                curveTo(13.916f, 6.194f, 13.999f, 5.858f, 13.999f, 5.5f)
                curveTo(13.999f, 4.121f, 12.878f, 3f, 11.499f, 3f)
                curveTo(10.12f, 3f, 8.999f, 4.121f, 8.999f, 5.5f)
                curveTo(8.999f, 5.858f, 9.083f, 6.194f, 9.219f, 6.501f)
                lineTo(9.22f, 6.502f)
                close()
                moveTo(5.07f, 11.069f)
                verticalLineTo(11.071f)
                curveTo(5.226f, 10.549f, 5.662f, 10.162f, 6.2f, 10.049f)
                curveTo(6.3f, 9.682f, 6.437f, 9.331f, 6.607f, 8.999f)
                horizontalLineTo(6.5f)
                curveTo(5.935f, 8.999f, 5.419f, 9.194f, 5f, 9.511f)
                verticalLineTo(4.948f)
                curveTo(6.14f, 4.716f, 7f, 3.706f, 7f, 2.499f)
                curveTo(7f, 1.12f, 5.879f, -9.99451E-4f, 4.5f, -9.99451E-4f)
                curveTo(3.121f, -9.99451E-4f, 2f, 1.12f, 2f, 2.499f)
                curveTo(2f, 3.707f, 2.86f, 4.716f, 4f, 4.948f)
                verticalLineTo(11.049f)
                curveTo(2.86f, 11.281f, 2f, 12.291f, 2f, 13.498f)
                curveTo(2f, 14.877f, 3.121f, 15.998f, 4.5f, 15.998f)
                curveTo(5.565f, 15.998f, 6.469f, 15.327f, 6.829f, 14.387f)
                curveTo(6.31f, 13.551f, 6.004f, 12.569f, 6.001f, 11.515f)
                curveTo(5.727f, 11.308f, 5.415f, 11.15f, 5.07f, 11.069f)
                close()
                moveTo(2.999f, 2.5f)
                curveTo(2.999f, 1.673f, 3.672f, 1f, 4.499f, 1f)
                curveTo(5.326f, 1f, 5.999f, 1.673f, 5.999f, 2.5f)
                curveTo(5.999f, 3.327f, 5.326f, 4f, 4.499f, 4f)
                curveTo(3.672f, 4f, 2.999f, 3.327f, 2.999f, 2.5f)
                close()
                moveTo(4.499f, 15f)
                curveTo(3.672f, 15f, 2.999f, 14.327f, 2.999f, 13.5f)
                curveTo(2.999f, 12.673f, 3.672f, 12f, 4.499f, 12f)
                curveTo(5.326f, 12f, 5.999f, 12.673f, 5.999f, 13.5f)
                curveTo(5.999f, 14.327f, 5.326f, 15f, 4.499f, 15f)
                close()
                moveTo(11.499f, 7f)
                curveTo(9.014f, 7f, 6.999f, 9.015f, 6.999f, 11.5f)
                curveTo(6.999f, 13.985f, 9.014f, 16f, 11.499f, 16f)
                curveTo(13.984f, 16f, 15.999f, 13.985f, 15.999f, 11.5f)
                curveTo(15.999f, 9.015f, 13.984f, 7f, 11.499f, 7f)
                close()
                moveTo(13.915f, 12.317f)
                curveTo(14.154f, 12.455f, 14.236f, 12.761f, 14.098f, 13f)
                curveTo(13.96f, 13.239f, 13.654f, 13.321f, 13.415f, 13.183f)
                lineTo(12f, 12.366f)
                verticalLineTo(14f)
                curveTo(12f, 14.276f, 11.776f, 14.5f, 11.5f, 14.5f)
                curveTo(11.224f, 14.5f, 11f, 14.276f, 11f, 14f)
                verticalLineTo(12.366f)
                lineTo(9.585f, 13.183f)
                curveTo(9.346f, 13.321f, 9.04f, 13.239f, 8.902f, 13f)
                curveTo(8.764f, 12.761f, 8.846f, 12.455f, 9.085f, 12.317f)
                lineTo(10.5f, 11.5f)
                lineTo(9.085f, 10.683f)
                curveTo(8.846f, 10.545f, 8.764f, 10.239f, 8.902f, 10f)
                curveTo(9.04f, 9.761f, 9.346f, 9.679f, 9.585f, 9.817f)
                lineTo(11f, 10.634f)
                verticalLineTo(9f)
                curveTo(11f, 8.724f, 11.224f, 8.5f, 11.5f, 8.5f)
                curveTo(11.776f, 8.5f, 12f, 8.724f, 12f, 9f)
                verticalLineTo(10.634f)
                lineTo(13.415f, 9.817f)
                curveTo(13.654f, 9.679f, 13.96f, 9.761f, 14.098f, 10f)
                curveTo(14.236f, 10.239f, 14.154f, 10.545f, 13.915f, 10.683f)
                lineTo(12.5f, 11.5f)
                lineTo(13.915f, 12.317f)
                close()
            }
        }.build()
        
        return _GitBranchChanges!!
    }

private var _GitBranchChanges: ImageVector? = null

