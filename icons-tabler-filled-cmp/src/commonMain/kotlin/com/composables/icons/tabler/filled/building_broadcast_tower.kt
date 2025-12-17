package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BuildingBroadcastTower: ImageVector
    get() {
        if (_BuildingBroadcastTower != null) return _BuildingBroadcastTower!!
        
        _BuildingBroadcastTower = ImageVector.Builder(
            name = "building-broadcast-tower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 10f)
                arcToRelative(2f, 2f, 0f, false, true, 1.497f, 3.327f)
                lineToRelative(2.452f, 7.357f)
                arcToRelative(1f, 1f, 0f, true, true, -1.898f, 0.632f)
                lineToRelative(-0.44f, -1.316f)
                horizontalLineToRelative(-3.224f)
                lineToRelative(-0.438f, 1.317f)
                arcToRelative(1f, 1f, 0f, false, true, -1.152f, 0.663f)
                lineToRelative(-0.113f, -0.03f)
                arcToRelative(1f, 1f, 0f, false, true, -0.633f, -1.265f)
                lineToRelative(2.452f, -7.357f)
                arcToRelative(2f, 2f, 0f, false, true, -0.503f, -1.328f)
                lineToRelative(0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, false, true, 1.995f, -1.85f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.093f, 4.078f)
                arcToRelative(10f, 10f, 0f, false, true, 3.137f, 11.776f)
                arcToRelative(1f, 1f, 0f, false, true, -1.846f, -0.77f)
                arcToRelative(8f, 8f, 0f, true, false, -14.769f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -1.846f, 0.77f)
                arcToRelative(10f, 10f, 0f, false, true, 15.324f, -11.776f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.657f, 7.243f)
                arcToRelative(6f, 6f, 0f, false, true, 1.882f, 7.066f)
                arcToRelative(1f, 1f, 0f, true, true, -1.846f, -0.77f)
                arcToRelative(4f, 4f, 0f, true, false, -7.384f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -1.846f, 0.77f)
                arcToRelative(6f, 6f, 0f, false, true, 9.194f, -7.066f)
            }
        }.build()
        
        return _BuildingBroadcastTower!!
    }

private var _BuildingBroadcastTower: ImageVector? = null

